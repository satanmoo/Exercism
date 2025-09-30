#include "robot_simulator.h"

robot_status_t robot_create(robot_direction_t direction, int x, int y)
{
    robot_status_t robot;
    robot_position_t position;

    robot.direction = direction;
    position.x = x;
    position.y = y;
    robot.position = position;

    return robot;
}

void robot_move(robot_status_t* robot, const char* commands)
{
    while (1) {
        const char command = *commands;
        if (command == '\0') {
            break;
        }

        if (command == 'R') {
            robot->direction = (robot->direction + 1) % 4;
        } else if (command == 'L') {
            robot->direction = (robot->direction - 1) % 4;
        } else if (command == 'A') {
            if (robot->direction == DIRECTION_NORTH) {
                robot->position.y += 1;
            } else if (robot->direction == DIRECTION_EAST) {
                robot->position.x += 1;
            } else if (robot->direction == DIRECTION_SOUTH) {
                robot->position.y -= 1;
            } else {
                robot->position.x -= 1;
            }
        }
        ++commands;
    }
}