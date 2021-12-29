package com.newlecture.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.newlecture.app.entity.Notice;
import com.newlecture.app.service.NoticeService;

public class NoticeConsole {

	private NoticeService service;
	private int page;
	private int count;
	public NoticeConsole() {
		service= new NoticeService();
		page =1;
		count=0;
	}
	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list =  service.getList(page);
		count = service.getCount();
		
		System.out.println("ΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑ");
		System.out.printf("<因走紫牌> 恥%d 惟獣越\n",count);
		System.out.println("ΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑ");
		for(Notice n : list) {
			System.out.printf("%d. %s / %s / %s\n",
					n.getId(),
					n.getTitle(),
					n.getWriterId(),
					n.getRegDate());
			
		}
		System.out.println("ΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑΑ");
		System.out.printf("                      %d/%d page\n",page,2);
	}

	public int inputNoticeMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("/1. 雌室繕噺 / 2. 戚穿 / 3.陥製 / 4.越床奄 /5,曽戟	>");
		String menu_ = scan.nextLine();
		int menu = Integer.parseInt(menu_);
		return menu;
		//砺什闘けけけけいけAs
	}
	public void movePrevList() {
		if(page ==1) {
			System.out.println("戚穿凪戚走亜 蒸柔艦陥.");
			return;
		}
		page--;
	}
	public void moveNextList() {
//		if(page ==1) {
//			System.out.println("戚穿凪戚走亜 蒸柔艦陥.");
//		}
		page++;
		
	}

	
}
