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
        StringBuilder normalResult = new StringBuilder().append("Hello");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            String cleanedName = StringUtils.remove(name, ",");
            if(!iterator.hasNext()) {
                normalResult.append(" and " + cleanedName + ".");
                break;
            }
            normalResult.append(", " + cleanedName);
        }
        return normalResult.toString();
    }

}
