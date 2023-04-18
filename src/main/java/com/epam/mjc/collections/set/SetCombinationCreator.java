package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        Set<String> difference = new HashSet<>(intersection);
        difference.removeAll(thirdSet);
        Set<String> difference1 = new HashSet<>(thirdSet);
        difference1.removeAll(intersection);
        Set<String> union = new HashSet<>(difference);
        union.addAll(difference1);
        return union;
    }
}
