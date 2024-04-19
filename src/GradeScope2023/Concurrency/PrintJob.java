package GradeScope2023.Concurrency;

import lombok.Data;

@Data
public class PrintJob {
    private final String whatToPrint;
    private PrintJob followingJob;

}
