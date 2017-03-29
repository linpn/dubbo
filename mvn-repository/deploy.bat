del com/
cd ../dubbo
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy
@pause
