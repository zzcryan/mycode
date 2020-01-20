import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Wash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 11.2.4 */
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Washable w = (Washable) ctx.getBean("w");
		w.wash();
		/* 11.2.4 */
	}

}
