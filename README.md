# ☕ Java Design Patterns

## Adapter

Adapter pattern converts the interface of a class into another interface as expected. Wrap an incompatible object in an adapter to make it compatible with another class.

For example, let's say you're at a Windows virtual machine running on top of a Linux host, using the command line. There is an Hypervisor in between that adapts your windows commands into unix commands, and you as the user does not even know it's doing it. 