package builder1;

public class Director {

  public void Construct(Builder builder) {
    builder.BuildCPU();
    builder.BuildHD();
    builder.BuildMainbord();
  }
}
