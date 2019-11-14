
/**
 * The purpose of this program is to generate a random password for any user.
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ranges {
  private final List<Integer> range = new ArrayList<>();

  Ranges(int min, int max) {
    this.addRange(min, max);
  }

  final void addRange(int min, int max) {
    for (int i = min; i <= max; i++) {
      this.range.add(i);
    }
  }

  int getRandom() {
    return this.range.get(new Random().nextInt(this.range.size()));
  }
}
