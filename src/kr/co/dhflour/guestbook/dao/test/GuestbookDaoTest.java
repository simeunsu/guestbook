package kr.co.dhflour.guestbook.dao.test;

import java.util.List;

import kr.co.dhflour.guestbook.dao.GuestbookDao;
import kr.co.dhflour.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		//deleteTest();
		//insertTest();
		fetchListTest();

	}
	
	public static void fetchListTest() { 
		GuestbookDao dao = new GuestbookDao();
		List<GuestbookVo> list = dao.fetchList();
		
		for ( GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void insertTest() { 
		GuestbookDao dao = new GuestbookDao();
		//mock date 
		GuestbookVo vo = new GuestbookVo();
		vo.setName("심선영2");
		vo.setPassword("1234");
		vo.setContents("이쁘다2");
		dao.insert(vo);
		
	}
	
	public static void deleteTest() { 
		GuestbookDao dao = new GuestbookDao();
		//mock date 
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(4);
		vo.setPassword("1234");
		dao.delete(vo);
		
	}
	

}
