package ex1;

import java.sql.SQLException;

import com.newlecture.app.console.NoticeConsole;

public class Program5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NoticeConsole console = new NoticeConsole();
		EXIT:while(true) {
			console.printNoticeList();
			int menu = console.inputNoticeMenu();
			switch(menu) {
				case 1 :
					break;
				case 2 :
					break;
				case 3:
					break;
				case 4:
					break;
				case 5://종료
					System.out.println("종료");
					break EXIT;
				default:
					System.out.println("1~114만 입11122332122력가1능");//테스트1;
					break;
			}

		}
	}
}
