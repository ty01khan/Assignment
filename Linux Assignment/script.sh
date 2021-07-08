#!/bin/bash

cat << EOF > Assignment
This is a sample file.
EOF

mv Assignment "/tmp"	# Assignment file is moved to /tmp directory
 
FILE_PATH="/tmp/Assignment"
echo $FILE_PATH
cat $FILE_PATH
