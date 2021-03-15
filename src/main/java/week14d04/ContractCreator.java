package week14d04;

import java.util.List;

public class ContractCreator {
    public Contract contractTemplate;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        contractTemplate = new Contract(client, monthlyPrices);
    }
    public Contract create(String client) {
        return new Contract(client, contractTemplate.getMonthlyPrices());
    }

    public Contract getTemplate() {
        return contractTemplate;
    }

    public static void main(String[] args) {
        ContractCreator contractTemplate = new ContractCreator("András", List.of(1000, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 1000, 1100, 1200));
        Contract contract = contractTemplate.create("Tamás");
        contract.getMonthlyPrices().set(11, 1500);
        System.out.println(contract);
        System.out.println(contractTemplate.getTemplate().getMonthlyPrices());
    }
}
