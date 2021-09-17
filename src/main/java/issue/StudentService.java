package issue;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService{

  private final StudentRepository studentRepository;


  @Transactional(readOnly = true)
  public List<String> getAllByName(String value){
    return studentRepository.getAllByName(value);
  }
}