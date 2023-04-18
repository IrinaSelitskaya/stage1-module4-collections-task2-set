package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        Set<String> difference = new HashSet<>(thirdSet);
        difference.removeAll(firstSet);
        Set<String> difference1 = new HashSet<>(difference);
        difference1.removeAll(secondSet);
        Set<String> union = new HashSet<>(intersection);
        union.addAll(difference1);
        return union;
    }
}
