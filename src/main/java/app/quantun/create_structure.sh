#!/bin/bash

# Set the base directory for your project
BASE_DIR="$(pwd)"

# Create the directory structure for CQRS and DDD
mkdir -p $BASE_DIR/{command/{controller,handler,model,publisher},query/{controller,handler,model,subscriber},config}

echo "Directory structure created successfully under $BASE_DIR."
