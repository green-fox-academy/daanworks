package com.greenfoxacademy.basicwebshop.controller;

import com.greenfoxacademy.basicwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {

    List<ShopItem> shopItems = new ArrayList<>();

    public ShopItemController() {
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5, "Clothes and Shoes"));
        shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2, "Electronics"));
        shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0, "Beverages and Snacks"));
        shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100, "Beverages and Snacks"));
        shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1, "Clothes and Shoes"));
    }

    @GetMapping("/webshop")
    public String helloWorld() {
        return "helloworld";
    }

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("shopItems", shopItems);
        return "webshop";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("shopItems", optionalAvailbaleItems());
        return "webshop";
    }

    private List<ShopItem> optionalAvailbaleItems() {
        return shopItems.stream()
                .filter(item -> item.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
    }

    @GetMapping("cheapest-first")
    public String getCheapestFirst(Model model) {
        model.addAttribute("shopItems", cheapestFirst());
        return "webshop";
    }

    private List<ShopItem> cheapestFirst() {
        return shopItems.stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("shopItems", getNike());
        return "webshop";
    }

    private List<ShopItem> getNike() {
        return shopItems.stream()
                .filter(item -> item.getName().toLowerCase().contains("nike") || item.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        if(getAverage().isPresent()) {
            model.addAttribute("text", "Average stock: ");
            model.addAttribute("value", getAverage().getAsDouble());
        } else {
            model.addAttribute("text", "Average stock: ");
            model.addAttribute("value", "empty list!");
        }
        return "filtered";
    }

    private OptionalDouble getAverage() {
        return shopItems.stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average();
    }

    @GetMapping("/most-expensive")
    public String getMostExpensive(Model model) {
        if(mostExpensive().isPresent()) {
            model.addAttribute("text", "Most expensive: ");
            model.addAttribute("value", mostExpensive().get().getName());
        } else {
            model.addAttribute("text", "Most expensive: ");
            model.addAttribute("value", "empty list!");
        }
        return "filtered";
    }

    private Optional<ShopItem> mostExpensive() {
        return shopItems.stream()
                .max(Comparator.comparingDouble(ShopItem::getPrice));
    }

    @PostMapping("/search")
    public String getSearchItems(@RequestParam String search, Model model) {
        model.addAttribute("shopItems", searchItems(search));
        return "webshop";
    }

    private List<ShopItem> searchItems(String input) {
        return shopItems.stream()
                .filter(item -> item.getName().toLowerCase().contains(input) || item.getDescription().toLowerCase().contains(input))
                .collect(Collectors.toList());
    }

    @GetMapping("/more-filters")
    public String moreFilters(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "more-filters";
    }

    @GetMapping("/clothes-and-shoes")
    public String getClothesAndShoes(Model model) {
        model.addAttribute("shopItems", getFilteredByType("Clothes and Shoes"));
        return "more-filters";
    }

    @GetMapping("/electronics")
    public String getElectronics(Model model) {
        model.addAttribute("shopItems", getFilteredByType("Electronics"));
        return "more-filters";
    }

    @GetMapping("/beverages-and-snacks")
    public String getBeveragesAndSnacks(Model model) {
        model.addAttribute("shopItems", getFilteredByType("Beverages and Snacks"));
        return "more-filters";
    }

    private List<ShopItem> getFilteredByType(String type) {
        return shopItems.stream()
                .filter(item -> item.getType().equals(type))
                .collect(Collectors.toList());
    }



}
