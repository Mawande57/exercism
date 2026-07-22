#include <string>

namespace log_line {
std::string message(std::string line) {
    // Find the colon and skip the colon and space
    size_t colon_pos = line.find(':');
    // The message starts after the colon and space
    return line.substr(colon_pos + 2);
}

std::string log_level(std::string line) {
    // Find the opening and closing brackets
    size_t bracket_start = line.find('[');
    size_t bracket_end = line.find(']');
    // Extract the level (excluding the brackets)
    return line.substr(bracket_start + 1, bracket_end - bracket_start - 1);
}

std::string reformat(std::string line) {
    // Get the message and log level using the existing functions
    std::string msg = message(line);
    std::string level = log_level(line);
    // Return the reformatted string
    return msg + " (" + level + ")";
}
}  // namespace log_line