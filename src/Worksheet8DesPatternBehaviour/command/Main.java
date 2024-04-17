package Worksheet8DesPatternBehaviour.command;

public class Main {
    public static void main(String[] args) {

        ThreadPool pool = new ThreadPool(10);

        Email email = null;
        EmailJob emailJob = new EmailJob();

        Sms sms = null;
        SmsJob smsJob = new SmsJob();

        FileIO fileio = null;
        FileIOJob fileIOJob = new FileIOJob();

        Logging logging = null;
        LoggingJob logjob = new LoggingJob();

        for (int i = 0; i < 5; i++) {
            email = new Email();
            emailJob.setEmail(email);

            sms = new Sms();
            smsJob.setSms(sms);

            fileio = new FileIO();
            fileIOJob.setFileIO(fileio);

            logging = new Logging();
            logjob.setLogging(logging);

            pool.addJob(emailJob);
            pool.addJob(smsJob);
            pool.addJob(fileIOJob);
            pool.addJob(logjob);
        }

        pool.shutdownPool();

    }
}
