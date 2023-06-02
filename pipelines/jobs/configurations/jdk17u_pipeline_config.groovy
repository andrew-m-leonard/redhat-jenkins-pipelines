class Config17 {

    final Map<String, Map<String, ?>> buildConfigurations = [
        x64Linux  : [
                os                  : 'linux',
                arch                : 'x64',
                dockerImage: [
                        temurin     : 'adoptopenjdk/centos6_build_image'
                ],
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

Config17 config = new Config17()
return config.buildConfigurations
