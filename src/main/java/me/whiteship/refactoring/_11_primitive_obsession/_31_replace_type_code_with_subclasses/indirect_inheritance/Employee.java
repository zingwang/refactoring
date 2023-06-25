package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance.Manager;
import me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance.Salesman;

import java.util.List;

public class Employee {

    private String name;

    private String typeValue;

    private EmployeeType type;

    public Employee(String name, String typeValue) {
        this.validate(typeValue);
        this.name = name;
        this.typeValue = typeValue;
        this.type= this.employeeType(typeValue);
    }

    private EmployeeType employeeType(String typeValue){
        return switch (typeValue){
            case "engineer": yield new Engineer();
            case "manager": yield new Manager();
            case "salesman": yield new Salesman();
            default: throw new IllegalArgumentException(typeValue);
        };
    }
    private void validate(String type) {
        List<String> legalTypes = List.of("engineer", "manager", "salesman");
        if (!legalTypes.contains(type)) {
            throw new IllegalArgumentException(type);
        }
    }

    public String capitalizedType() {
        return this.typeValue.substring(0, 1).toUpperCase() + this.typeValue.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + typeValue + '\'' +
                '}';
    }
}
