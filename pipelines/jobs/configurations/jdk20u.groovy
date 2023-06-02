targetConfigurations = [
        'x64Linux'    : [
                'temurin'
        ]
]

// 03:30 Wed, Fri
triggerSchedule_nightly = 'TZ=UTC\n30 03 * * 3,5'
// 23:30 Sat
triggerSchedule_weekly = 'TZ=UTC\n30 23 * * 6'

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'temurin'        : ''
]

return this
