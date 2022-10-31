#!/bin/bash

usage () {
	echo "Usage: $0: [ -g <filter deps for artifact groupId>] [-a all]" 1>&2; exit 1;
}

if [ $# -eq 0 ]; then
    usage
fi

while getopts ":g:a:" args; do
	case ${args} in 
		g)
			GROUP_ID=${OPTARG};;
		a)
			GROUP_ID="";;
		*)
			usage
			;;
	esac	
done
shift $((OPTIND-1))

echo "$GROUP_ID"



