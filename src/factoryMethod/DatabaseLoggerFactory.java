package factoryMethod;

public class DatabaseLoggerFactory implements LoggerFactory {

  @Override
  public Logger createLogger() {
    Logger logger = new DatabaseLogger();
    return logger;
  }
}
