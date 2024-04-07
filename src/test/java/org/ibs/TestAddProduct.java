package org.ibs;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.concurrent.TimeUnit;

//public class TestAddProduct {



   // @Test
  // void GoToTheProductListPage() {
      //  driver.get("http://localhost:8080");
      //  WebElement sandboxButton = driver.findElement(By.xpath("//a [@id='navbarDropdown']"));
       // sandboxButton.click();
      //  WebElement goodsButton = driver.findElement(By.xpath("//a [@href='/food']"));
      //  goodsButton.click();
      //  WebElement titleProductListPage = driver.findElement
      //          (By.xpath("//h5[contains(text(),\"Список товаров\")]"));
      //  Assertions.assertEquals(
      //          "Список товаров", titleProductListPage.getText(),
      //          "Страница http://localhost:8080/food не загрузилась");
  //  }

//    @Test
//    void addFruitExoticInProductList() throws InterruptedException {
//        driver.get("http://localhost:8080/food");
//        WebElement addButton = driver.findElement(By.xpath("//button[text()='Добавить']"));
//        addButton.click();
//        WebElement titleOfTheWindowForAddingProducts = driver.findElement
//                (By.xpath("//h5[@class='modal-title']"));
//        titleOfTheWindowForAddingProducts.isDisplayed();
//        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
//        nameGood.sendKeys("Папайя");
//        Select typeGood = new Select(driver.findElement(By.xpath("//select[@id='type']")));
//        typeGood.selectByValue("FRUIT");
//        WebElement checkBoxExotic = driver.findElement(By.id("exotic"));
//        checkBoxExotic.click();
//        WebElement saveButton = driver.findElement(By.id("save"));
//        saveButton.click();
//
//
//        WebElement table = driver.findElement(By.xpath("//tr[5]"));
//        Assertions.assertEquals("5 Папайя Фрукт true", table.getText());
//
//        Thread.sleep(7000);
//    }
//
//    @Test
//    void addFruitNotExoticInProductList() throws InterruptedException {
//        driver.get("http://localhost:8080/food");
//        WebElement addButton = driver.findElement(By.xpath("//button[text()='Добавить']"));
//        addButton.click();
//        WebElement titleOfTheWindowForAddingProducts = driver.findElement
//                (By.xpath("//h5[@class='modal-title']"));
//        titleOfTheWindowForAddingProducts.isDisplayed();
//        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
//        nameGood.sendKeys("Банан");
//        Select typeGood = new Select(driver.findElement(By.xpath("//select[@id='type']")));
//        typeGood.selectByValue("FRUIT");
//        WebElement saveButton = driver.findElement(By.id("save"));
//        saveButton.click();
//
//        WebElement table = driver.findElement(By.xpath("//tr[5]"));
//        Assertions.assertEquals("5 Банан Фрукт false", table.getText());
//
//        Thread.sleep(7000);
//
//
//    }
//
//    @Test
//    void addVegetableExoticInProductList() throws InterruptedException {
//        driver.get("http://localhost:8080/food");
//        WebElement addButton = driver.findElement(By.xpath("//button[text()='Добавить']"));
//        addButton.click();
//        WebElement titleOfTheWindowForAddingProducts = driver.findElement
//                (By.xpath("//h5[@class='modal-title']"));
//        titleOfTheWindowForAddingProducts.isDisplayed();
//        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
//        nameGood.sendKeys("Кивано");
//        Select typeGood = new Select(driver.findElement(By.xpath("//select[@id='type']")));
//        typeGood.selectByValue("VEGETABLE");
//        WebElement checkBoxExotic = driver.findElement(By.id("exotic"));
//        checkBoxExotic.click();
//        WebElement saveButton = driver.findElement(By.id("save"));
//        saveButton.click();
//
//        WebElement table = driver.findElement(By.xpath("//tr[5]"));
//        Assertions.assertEquals("5 Кивано Овощ true", table.getText());
//
//        Thread.sleep(7000);
//
//    }
//
//    @Test
//    void addVegetableNotExoticInProductList() throws InterruptedException {
//        driver.get("http://localhost:8080/food");
//        WebElement addButton = driver.findElement(By.xpath("//button[text()='Добавить']"));
//        addButton.click();
//        WebElement titleOfTheWindowForAddingProducts = driver.findElement
//                (By.xpath("//h5[@class='modal-title']"));
//        titleOfTheWindowForAddingProducts.isDisplayed();
//        WebElement nameGood = driver.findElement(By.xpath("//input[@id='name']"));
//        nameGood.sendKeys("Огурец");
//        Select typeGood = new Select(driver.findElement(By.xpath("//select[@id='type']")));
//        typeGood.selectByValue("VEGETABLE");
//        WebElement saveButton = driver.findElement(By.id("save"));
//        saveButton.click();
//        WebElement table = driver.findElement(By.xpath("//tr[5]"));
//        Assertions.assertEquals("5 Огурец Овощ false", table.getText());
//        Thread.sleep(7000);
//
//    }
//
//}
