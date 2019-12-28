public class DiskDrive {
  private double maxSpace = 64.0;
  private double freeSpace = 64.0;
  private double usedSpace = 0.0;

  // postcondition: all instance variables are initialized
  public DiskDrive(double sizeCapacity) {
    maxSpace = sizeCapacity;
  }

  // postcondition: the disk space occupied is increased by the amount given by
  // the
  // parameter and cannot exceed the maximum
  public void addFile(double size) {
    if (usedSpace + size < maxSpace) {
      usedSpace += size;
      freeSpace -= size;
    } else {
      usedSpace = maxSpace;
      freeSpace = 0.0;
    }
  }

  // postcondition: the disk space occupied is decreased by the amount given by
  // the
  // parameter and cannot be negative
  public void deleteFile(double size) {
    if (usedSpace - size < 0) {
      usedSpace = 0.0;
      freeSpace = maxSpace;
    } else {
      usedSpace -= size;
      freeSpace += size;
    }
  }

  // postcondition: a quantity equal to the unoccupied disk space is provided and
  // is
  // not negative
  public double getFreeSpace() {
    return freeSpace;
  }
}
