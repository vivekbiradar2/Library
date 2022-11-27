Def newDownload(repo)
{
 git 'https://github.com/intelliqittrainings/${repo}
}
Def newBuild()
{
 sh 'mvn package'
}
Def newDeployment(IP,Name)
{
 deploy adapters: [tomcat9(credentialsId: '107a6dfb-0bd5-41c4-a562-5477e7587c8a', path: '', url: 'http://${IP}:8080')], contextPath: '${Name}', war: '**/*.war'
}
