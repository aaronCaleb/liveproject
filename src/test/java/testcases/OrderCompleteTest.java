package testcases;

import base.BasePage;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.*;

import java.io.IOException;


public class OrderCompleteTest extends Hooks {

   public OrderCompleteTest() throws IOException {
      super();
   }

   @Test
   public void endToEndTest() throws InterruptedException, IOException {
      HomePage homePage = new HomePage();
      homePage.getTestStoreLink().click();

      StoreHomePage storeHomePage=new StoreHomePage();
      storeHomePage.getProdOne().click();

      StoreProductPage storeProductPage=new StoreProductPage();
      Select menuItem=new Select(storeProductPage.getSizeOption());
      menuItem.selectByVisibleText("M");
      storeProductPage.getQuantIncrease().click();
      storeProductPage.getAddToCartBtn().click();

      StoreContentPage storeContentPage=new StoreContentPage();
      storeContentPage.getCheckoutBtn().click();

      ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
      shoppingCartPage.getHavePromo().click();
      shoppingCartPage.getPromoTextbox().sendKeys("20OFF");
      shoppingCartPage.getPromoAddBtn().click();
      shoppingCartPage.getProceedCheckoutBtn().click();

      OnlineFormPersonsInfo onlineFormPersonsInfo=new OnlineFormPersonsInfo();
      onlineFormPersonsInfo.getGenderMr().click();
      onlineFormPersonsInfo.getFirstNameField().sendKeys("Nireekshan");
      onlineFormPersonsInfo.getLastnameField().sendKeys("Sodavaram");
      onlineFormPersonsInfo.getEmailField().sendKeys("n.kumar988920@outlook.com");
      onlineFormPersonsInfo.getPasswordField().sendKeys("Ilovemymom23#");
      onlineFormPersonsInfo.getBirthDateField().sendKeys("06/22/1981");
      onlineFormPersonsInfo.getTermsConditionsCheckbox().click();
      onlineFormPersonsInfo.getContinueBtn().click();

      OrderFormDelivery orderFormDelivery=new OrderFormDelivery();
      orderFormDelivery.getAddressField().sendKeys("14 Vestley Drive");
      orderFormDelivery.getCityField().sendKeys("Melbourne");
      Select menuItem2=new Select(orderFormDelivery.getStateDropdown());
      menuItem2.selectByVisibleText("Colorado");
      orderFormDelivery.getPostcodeField().sendKeys("80202");
      Thread.sleep(3000);
      orderFormDelivery.getContinueBtn().click();


      OrderFormShippingMethod orderFormShippingMethod=new OrderFormShippingMethod();
      orderFormShippingMethod.getContinueBtn().click();

      OrderFormPayment orderFormPayment=new OrderFormPayment();
      orderFormPayment.getPayByWireRadioBtn().click();
      orderFormPayment.getTermsConditionsCheckbox().click();
      orderFormPayment.getOrderBtn().click();
   }

}
