package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        int intersectionSize = intersection.size();

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        int unionSize = union.size();

        return (double) intersectionSize / unionSize;
    }

}
