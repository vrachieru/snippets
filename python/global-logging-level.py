import logging

# usage: set_global_logging_level(logging.DEBUG)
def set_global_logging_level(logging_level):
    logger = logging.getLogger()
    for logger_name in sorted(logging.root.manager.loggerDict):
        logger.info('Setting logger "%s" to "%s"' % (logger_name, logging_level))
        logging.getLogger(logger_name).setLevel(logging_level)