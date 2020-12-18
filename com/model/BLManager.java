package com.model;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Bookedticket;
import com.pojo.Cabbooking;
import com.pojo.Cabs;
import com.pojo.Flight;
import com.pojo.Hotel;
import com.pojo.Hotelbooking;
import com.pojo.Registrationdata;
import com.pojo.Roll;
import com.pojo.Tourguide;
import com.pojo.Tourguidebooking;

public class BLManager {
	SessionFactory con = new Configuration().configure().buildSessionFactory();

	public Roll serachchbyroll(String rollname) {
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Roll.class);
		cr.add(Restrictions.eq("rollname", rollname));
		Roll r = (Roll) cr.uniqueResult();
		return r;
	}

	public void registrationsave(Registrationdata reg) {
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(reg);
		t1.commit();
		s1.close();
	}

	public boolean serachbyep(String email, String pass) {
		Registrationdata reg = serachbyemailpass(email, pass);

		if (reg != null && reg.getEmail().equals(email) && reg.getPassword().equals(pass)) {
			return true;
		} else {
			return false;
		}
	}

	private Registrationdata serachbyemailpass(String email, String pass) {
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Registrationdata.class);
		cr.add(Restrictions.eq("email", email));
		cr.add(Restrictions.eq("password", pass));
		Registrationdata r = (Registrationdata) cr.uniqueResult();
		return r;
	}

	public Registrationdata serachbyemail(String email) {
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Registrationdata.class);
		cr.add(Restrictions.eq("email", email));
		Registrationdata r = (Registrationdata) cr.uniqueResult();
		return r;
	}

	public void savedataflight(Flight f) {
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(f);
		t1.commit();
		s1.close();
	}
	
	public List<Flight> serachlistflight()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Flight.class);
		List<Flight> f=cr.list();
		return f;
	}
	public List<Tourguide> serachlistguide()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Tourguide.class);
		List<Tourguide> f=cr.list();
		return f;
	}
	
	public List<Hotel> serachlisthotel()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Hotel.class);
		List<Hotel> f=cr.list();
		return f;
	}
	

	public List<Cabs> serachlistcabs()
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Cabs.class);
		List<Cabs> f=cr.list();
		return f;
	}
	public Flight serachbyflightid(int id) {
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Flight.class);
		cr.add(Restrictions.eq("fid",id));
		Flight r = (Flight) cr.uniqueResult();
		return r;
	}

	public void deleteflight(Flight f) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.delete(f);
		t1.commit();
		s1.close();
	}

	public void upfdateflight(Flight f)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.update(f);
		t1.commit();
		s1.close();
	}

	public void savedatahotel(Hotel h) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(h);
		t1.commit();
		s1.close();
	}

	public Hotel serachbyhotelid(int id) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Hotel.class);
		cr.add(Restrictions.eq("hid",id));
		Hotel r = (Hotel) cr.uniqueResult();
		return r;
	}

	public void deletehotel(Hotel h) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.delete(h);
		t1.commit();
		s1.close();
	}

	public void updatedatahotel(Hotel h) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.update(h);
		t1.commit();
		s1.close();
	}

	public void savedatacabs(Cabs c) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(c);
		t1.commit();
		s1.close();
	}

	public Cabs serachbycabid(int cabid)
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Cabs.class);
		cr.add(Restrictions.eq("cabid",cabid));
		Cabs r = (Cabs) cr.uniqueResult();
		return r;
	}

	public void updatedatacabs(Cabs c) {
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.update(c);
		t1.commit();
		s1.close();
	}

	public void deletecab(Cabs c) {
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.delete(c);
		t1.commit();
		s1.close();
	}

	public void savedataguide(Tourguide t)
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(t);
		t1.commit();
		s1.close();
	}

	public void updateguide(Tourguide t) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.update(t);
		t1.commit();
		s1.close();
	}

	public Tourguide serachbyguideid(int id) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Tourguide.class);
		cr.add(Restrictions.eq("tid",id));
		Tourguide r = (Tourguide) cr.uniqueResult();
		return r;
	}

	public void deleteguide(Tourguide t) {
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.delete(t);
		t1.commit();
		s1.close();
	}

	public Flight serachflightby(Date fdate, int id) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Flight.class);
		cr.add(Restrictions.eq("flightdate",fdate));
		cr.add(Restrictions.eq("fid",id));
		Flight r = (Flight) cr.uniqueResult();
		return r;
	}

	public void svaebooking(Bookedticket booking) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(booking);
		t1.commit();
		s1.close();
	}

	public List<Bookedticket> serachbooklist(String email) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Bookedticket.class,"reg");
		cr.createAlias("reg.registrationdata","r");
		cr.add(Restrictions.eq("r.email", email));
		List<Bookedticket> f=cr.list();
		return f;
	}

	public void svaehotelbooking(Hotelbooking h) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(h);
		t1.commit();
		s1.close();
	}
	
	public List<Hotelbooking> serachbookhotellist(String email) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Hotelbooking.class,"reg");
		cr.createAlias("reg.registrationdata","r");
		cr.add(Restrictions.eq("r.email", email));
		List<Hotelbooking> f=cr.list();
		return f;
	}

	public void svaecabbooking(Cabbooking cabs) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(cabs);
		t1.commit();
		s1.close();
	}
	
	public List<Cabbooking> serachbookcablist(String email) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Cabbooking.class,"reg");
		cr.createAlias("reg.registrationdata","r");
		cr.add(Restrictions.eq("r.email", email));
		List<Cabbooking> f=cr.list();
		return f;
	}

	public void svaetourbooking(Tourguidebooking t) 
	{
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(t);
		t1.commit();
		s1.close();
	}
	
	public List<Tourguidebooking> serachbooktourgudelist(String email) 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Tourguidebooking.class,"reg");
		cr.createAlias("reg.registrationdata","r");
		cr.add(Restrictions.eq("r.email", email));
		List<Tourguidebooking> f=cr.list();
		return f;
	}
	
	public List<Hotelbooking> serachhotelbooking() 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Hotelbooking.class);
		List<Hotelbooking> f=cr.list();
		return f;
	}
	
	public List<Cabbooking> serachcabbooking() 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Cabbooking.class);
		List<Cabbooking> f=cr.list();
		return f;
	}
	
	public List<Tourguidebooking> serachtourguidebooking() 
	{
		Session s1 = con.openSession();
		Criteria cr = s1.createCriteria(Tourguidebooking.class);
		List<Tourguidebooking> f=cr.list();
		return f;
	}

}
