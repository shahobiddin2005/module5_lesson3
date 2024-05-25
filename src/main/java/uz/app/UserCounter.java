package uz.app;

import java.util.HashMap;
import java.util.Map;

public class UserCounter {
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long, Long> count = new HashMap<>();
        for (Map<String, UserStats> visit : visits) {
            if (visit == null) continue;
            for (String id : visit.keySet()) {
                if (id == null || visit.get(id) == null || visit.get(id).getVisitCount().isEmpty()) continue;
                if (!count.containsKey(Long.parseLong(id)))
                    count.put(Long.parseLong(id), visit.get(id).getVisitCount().get());
                else
                    count.put(Long.parseLong(id), (count.get(Long.parseLong(id)) + visit.get(id).getVisitCount().get()));

            }
        }
        return count;
    }
}
