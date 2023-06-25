package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance.Employee;

public class Engineer extends EmployeeType {


    @Override
    public String toString() {
        return "engineer";
    }
}
