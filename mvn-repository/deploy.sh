#!/bin/bash
rm -rf com/
cd ../dubbo
mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy
