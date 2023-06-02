targetConfigurations = [
        'x64Linux'    : [
                'temurin'
        ]
]

// 23:30 Tue, Thur
triggerSchedule_nightly = 'TZ=UTC\n30 23 * * 2,4'
// 12:05 Sun
triggerSchedule_weekly = 'TZ=UTC\n05 12 * * 7'

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'temurin'        : ''
]

return this
