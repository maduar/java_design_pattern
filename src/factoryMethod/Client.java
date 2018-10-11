package factoryMethod;

public class Client {

  public static void main(String[] args) {
    LoggerFactory loggerFactory = new FileLoggerFactory();
    Logger logger = loggerFactory.createLogger();
    logger.writeLog();

    LoggerFactory loggerFactory1 = new DatabaseLoggerFactory();
    Logger logger1 = loggerFactory1.createLogger();
    logger1.writeLog();
  }
}
