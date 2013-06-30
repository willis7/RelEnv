RelEnv
======

## Problem

When working with systems that span multiple hardware/technology stacks it can be difficult to track what versions of each application reside in each environment.

Example:

A system may have an Oracle DB, SQL Server, Service Bus and possibly a client tier. To test this system you may have a development, System Test, User Test and Production Environment. Tracking the versions of each component becomes increasingly difficult the larger the system.

## Solution

This grails project attempts to address the problem by offering a way of tracking the progress of Projects, Releasese and Versions, whilst also maintaining information around what is in each environment.

