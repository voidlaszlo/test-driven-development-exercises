package com.laszlo.tdd.greetingkata;

import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.List;

public class Greeter {

    public String greet() {
        return "Hello, my friend.";
    }

    public String greet(String name) {
        if(StringUtils.isAllUpperCase(name)) {
            return "HELLO " + name + "!";
        }
        return "Hello, " + name + ".";
    }

    public String greet(List<String> names) {
        StringBuilder result = new StringBuilder().append("Hello");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (!iterator.hasNext()) {
                result.append(" and " + name + ".");
                break;
            }
            result.append(", " + name);
        }
        return result.toString();
    }

}
