package issue;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = StudentController.BASE_URL)
@RequiredArgsConstructor
@SuppressWarnings("java:S4605" /* Spring beans should be considered by "@ComponentScan" */)

public class StudentController {

  public static final String BASE_URL = "/students";
  public final StudentService studentService;

  @GetMapping()
 public ResponseEntity<List<String>> getAllByName(
      @ApiParam(value = "Full or partial part of Name.", example = "Mar") @RequestParam(name = "name") @Nullable final String name
  ){
    final var result = studentService.getAllByName(name);

   return ResponseEntity
        .ok()
        .body(result);
  }
}
