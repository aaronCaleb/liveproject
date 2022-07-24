package testcases;

import base.Hooks;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class ShopLoginTest extends Hooks {

    public ShopLoginTest() throws IOException {
        super();
    }
    @Test
    public void addRemoveItem() throws IOException {
        HomePage homePage = new HomePage();
        homePage.getTestStoreLink().click();

        StoreHomePage storeHomePage = new StoreHomePage();
        storeHomePage.getLoginBtn().click();

        FileInputStream workbookLocation=new FileInputStream
                (System.getProperty("user.dir") + "\\src\\test\\resources\\credentials.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(workbookLocation);
        XSSFSheet sheet = workbook.getSheetAt(0);

        Row row1=sheet.getRow(1);
        Cell cellR1C0=row1.getCell(0);
        Cell cellR1C1=row1.getCell(1);

        String emailRow1=cellR1C0.toString();
        String passwordRow1=cellR1C1.toString();

        System.out.println(emailRow1);
        System.out.println(passwordRow1);
    }
}
