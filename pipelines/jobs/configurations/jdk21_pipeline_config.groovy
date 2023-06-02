class Config21 {

    final Map<String, Map<String, ?>> buildConfigurations = [
        x64Linux  : [
                os                  : 'linux',
                arch                : 'x64',
                dockerImage         : 'adoptopenjdk/centos7_build_image',
                test                : 'default',
                configureArgs       : [
                        'temurin'   : '--enable-dtrace'
                ],
                buildArgs           : [
                        'temurin'   : '--create-source-archive --create-jre-image --create-sbom'
                ]
        ]
  ]

}

Config21 config = new Config21()
return config.buildConfigurations
