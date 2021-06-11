
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Main {

	private String getTanggal() {  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		Date date = new Date();  
		return dateFormat.format(date);  
	}  

	private String tanggalan() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date();  
		return dateFormat.format(date);
	}

	private String tanggal() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
		Date date = new Date();  
		return dateFormat.format(date);
	}

	private String data() {
		DateFormat dateFormat = new SimpleDateFormat("E,MMM dd yyyy");  
		Date date = new Date();  
		return dateFormat.format(date);
	}
	public static void main(String[] args) {
		// object tanggal
		Date date = new Date();
		Main tanggal=new Main();

		System.out.println("1. Sekarang Tanggal yyyy-MM-dd   : "+tanggal.getTanggal());
		System.out.println("2. Sekarang Tanggal dd/MM/yyyy   : "+tanggal.tanggalan());
		System.out.println("3. Sekarang Tanggal dd/MMM/yyyy  : "+tanggal.tanggal());
		System.out.println("4. Sekarang Tanggal E,MMM dd yyyy: "+tanggal.data());  
	}

}
