# timer
Simple timer in JS, TS, Java and Python

## Constructor parameters
| Parameter   |      Type      |    Description    |
|----------|-------------|--------|
| id | string | The id of the timer |
| interval | int | The interval in milliseconds (1000 to set the timer in order to have a tick at every second) |

## Methods
| Name   |      Return type      |    Description    |
|----------|-------------|--------|
| enable | void | Enable the timer |
| disable | void | Disable the timer |
| run | void | To une into an update function (a loop) order to allow the timer to stay alive |
| nextTick | boolean | Returns true if the interval time has elapsed |
| reset | void | Reset the timer at its initiale state |
| restart | void | Restart the timer (same as reset but it start again automatically) |

## How to use
See any main example.
