package com.missionsky.ipp.kit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogKit {
	
private static class Holder {
	private static Logger logger = LogManager.getLogger(LogKit.class);
}

public static void synchronizeLog() {
	Holder.logger = LogManager.getLogger(LogKit.class);
}

public static void logNothing(Throwable t) {
	
}

public static void debug(String message) {
	Holder.logger.debug(message);
}

public static void debug(String message, Throwable t) {
	Holder.logger.debug(message, t);
}

public static void info(String message) {
	Holder.logger.info(message);
}

public static void info(String message, Throwable t) {
	Holder.logger.info(message, t);
}

public static void warn(String message) {
	Holder.logger.warn(message);
}

public static void warn(String message, Throwable t) {
	Holder.logger.warn(message, t);
}

public static void error(String message) {
	Holder.logger.error(message);
}

public static void error(String message, Throwable t) {
	Holder.logger.error(message, t);
}

public static void fatal(String message) {
	Holder.logger.fatal(message);
}

public static void fatal(String message, Throwable t) {
	Holder.logger.fatal(message, t);
}

public static boolean isDebugEnabled() {
	return Holder.logger.isDebugEnabled();
}

public static boolean isInfoEnabled() {
	return Holder.logger.isInfoEnabled();
}

public static boolean isWarnEnabled() {
	return Holder.logger.isWarnEnabled();
}

public static boolean isErrorEnabled() {
	return Holder.logger.isErrorEnabled();
}

public static boolean isFatalEnabled() {
	return Holder.logger.isFatalEnabled();
}

}
