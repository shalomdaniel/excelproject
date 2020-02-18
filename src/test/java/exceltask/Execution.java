package exceltask;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Execution {
	
	
	@Test
	private void exec() {
		Baseclass.launch("http://demo.automationtesting.in/Register.html");
		

	}
	
	@Test
	private void exec1() throws IOException, InterruptedException {
Pojo1 p1=new Pojo1();
//Thread.sleep(3000);
ArrayList<WebElement> li=new ArrayList<WebElement>();
li.add(p1.getFirstname());
li.add(p1.getLastname());
int k=0;
for(int i=1;i<li.size();i++)
{
	for(int j=0;j<2;j++)
	{
		Baseclass.fill(li.get(k), Baseclass.files(i, j));
		k++;
	}
}



	}
	

}
