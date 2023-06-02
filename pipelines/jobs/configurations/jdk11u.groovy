targetConfigurations = [
]

// 18:05 Tue, Thur
triggerSchedule_nightly = 'TZ=UTC\n05 18 * * 2,4'
// 17:05 Sat
triggerSchedule_weekly = 'TZ=UTC\n05 17 * * 6'

// scmReferences to use for weekly release build
weekly_release_scmReferences = [
        'temurin'        : ''
]

disableJob = true

return this

