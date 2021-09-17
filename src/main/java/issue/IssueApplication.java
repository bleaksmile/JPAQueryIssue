package issue;



@EnableConfigurationProperties
public class IssueApplication {

  @SuppressWarnings("java:S4823" /* Using command line arguments is security-sensitive */)
  public static void main(final String[] args) {
    SpringApplication.run(IssueApplication.class, args);
  }


}
