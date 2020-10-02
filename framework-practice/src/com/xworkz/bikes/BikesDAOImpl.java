package com.xworkz.bikes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.singleton.SFSingleton;

public class BikesDAOImpl implements BikesDAO {
	SessionFactory factory = SFSingleton.createSessionFactory();

	@Override
	public void saveRecords(BikesDTO dto) {
		System.out.println("Creating Session ");
		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			session.save(dto);
			trans.commit();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Something wrong in saveRecords() method");
		} finally {
			session.close();
		}
		System.out.println("End of session");

	}

	@Override
	public BikesDTO fetchAll(int id) {
		Session session = factory.openSession();
		try {
			BikesDTO bdto = session.get(BikesDTO.class, id);
			if (bdto != null) {
				return bdto;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			BikesDTO bdto = session.get(BikesDTO.class, id);
			System.out.println(bdto);
			if (Objects.nonNull(bdto)) {
				System.out.println("delete is successful");
				session.delete(bdto);
				;
				trans.commit();
			} else {
				System.out.println("delete is unsuccessful");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public void updateBrandNameById(String brandName, int id) {
		Session session = factory.openSession();
		try {

			BikesDTO bdto = session.get(BikesDTO.class, id);
			System.out.println();
			if (bdto != null) {
				session.beginTransaction().begin();
				System.out.println("Updated Successfully");
				bdto.setBrandName(brandName);
				session.update(bdto);
				session.getTransaction().commit();
			} else {
				System.out.println("Update is unsuccessful");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public void updatePriceAndBikeCCById(Double price, Integer CC, Integer id) {
		Session session = factory.openSession();
		try {

			BikesDTO bdto = session.load(BikesDTO.class, id);
			if (Objects.nonNull(bdto)) {
				System.out.println("Update is successful");
				session.beginTransaction().begin();
				bdto.setBikeCC(CC);
				bdto.setPrice(price);
				session.update(bdto);
				session.getTransaction().commit();
			} else {
				System.out.println("update is unsuccessful");
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}

	}

	@Override
	public List<BikesDTO> fetch(List<Integer> id) {
		Session session = factory.openSession();
		try {
			ArrayList<BikesDTO> arrList = new ArrayList<>();
			for (Integer bid : id) {
				System.out.println(bid);
				BikesDTO bdto = session.get(BikesDTO.class, bid);
				System.out.println(bdto);
				arrList.add(bdto);
			}
			System.out.println("In dao " + arrList);
			return arrList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void saveRecords(List<BikesDTO> list) {
		Session session = factory.openSession();
		try {
			for (BikesDTO bdto : list) {
				session.save(bdto);
				session.beginTransaction().commit();
				System.out.println("Insertion of Object "+bdto+" is successful");
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}

	}

}
