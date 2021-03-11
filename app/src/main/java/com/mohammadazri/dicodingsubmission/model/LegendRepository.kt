package com.mohammadazri.dicodingsubmission.model

import com.mohammadazri.dicodingsubmission.R

object LegendRepository {
    private val legendNames = arrayOf(
        "Wraith",
        "Bangalore",
        "Mirage",
        "Octane",
        "Revenant",
        "Horizon",
        "Fuse",
        "Gibraltar",
        "Caustic",
        "Wattson",
        "Rampart",
        "Lifeline",
        "Loba",
        "Bloodhound",
        "Pathfinder",
        "Crypto"
    )

    private val legendTitles = arrayOf(
        "Interdimensional Skirmisher",
        "Professional Soldier",
        "Holographic Trickster",
        "High-Speed Daredevil",
        "Synthetic Nightmare",
        "Gravitational Manipulator",
        "Explosives Enthusiast",
        "Shielded Fortress",
        "Toxic Trapper",
        "Static Defender",
        "Base of Fire",
        "Combat Medic",
        "Translocating Thief",
        "Technological Tracker",
        "Forward Scout",
        "Surveillance Expert"
    )

    private val legendRoleImages = arrayOf(
        R.drawable.offensive,
        R.drawable.offensive,
        R.drawable.offensive,
        R.drawable.offensive,
        R.drawable.offensive,
        R.drawable.offensive,
        R.drawable.offensive,
        R.drawable.defensive,
        R.drawable.defensive,
        R.drawable.defensive,
        R.drawable.defensive,
        R.drawable.support,
        R.drawable.support,
        R.drawable.recon,
        R.drawable.recon,
        R.drawable.recon
    )

    private val legendImages = arrayOf(
        R.drawable.wraith,
        R.drawable.bangalore,
        R.drawable.mirage,
        R.drawable.octane,
        R.drawable.revenant,
        R.drawable.horizon,
        R.drawable.fuze,
        R.drawable.gibraltar,
        R.drawable.caustic,
        R.drawable.wattson,
        R.drawable.rampart,
        R.drawable.lifeline,
        R.drawable.loba,
        R.drawable.bloodhound,
        R.drawable.pathfinder,
        R.drawable.crypto
    )

    private val legendDetailImages = arrayOf(
        R.drawable.wraith_detail,
        R.drawable.bangalore_detail,
        R.drawable.mirage_detail,
        R.drawable.octane_detail,
        R.drawable.revenant_detail,
        R.drawable.horizon_detail,
        R.drawable.fuse_detail,
        R.drawable.gibraltar_detail,
        R.drawable.caustic_detail,
        R.drawable.wattson_detail,
        R.drawable.rampart_detail,
        R.drawable.lifeline_detail,
        R.drawable.loba_detail,
        R.drawable.bloodhound_detail,
        R.drawable.pathfinder_detail,
        R.drawable.crypto_detail
    )

    private val legendRealName = arrayOf(
        "Renee Hope Blasey",
        "Anita Williams",
        "Elliott R. Witt",
        "Octavio Silva",
        "Kaleb Cross",
        "Dr. Mary Somers",
        "Walter Fitzroy",
        "Makoa Gibraltar",
        "Dr. Alexander Maxwell Nox",
        "Natalie Paquette",
        "Ramya Parekh",
        "Ajay Che",
        "Loba Andrade",
        "Unknown",
        "MRVN",
        "Tae Joon Park (박태준)"
    )

    private val legendGender = arrayOf(
        "Female",
        "Female",
        "Male",
        "Male",
        "Male",
        "Female",
        "Male",
        "Male",
        "Male",
        "Female",
        "Female",
        "Female",
        "Female",
        "Non-binary",
        "Male",
        "Male"
    )

    private val legendAge = arrayOf(
        "32",
        "38",
        "30",
        "24",
        "44",
        "37",
        "54",
        "30",
        "48",
        "22",
        "21",
        "24",
        "34",
        "Unknown",
        "75",
        "31"
    )

    private val legendHeight = arrayOf(
        "5'4 (163 cm)",
        "6'0 (183 cm)",
        "5'11 (181 cm)",
        "Unknown",
        "6'8 (203 cm)",
        "Unknown",
        "Unknown",
        "6'5 (196 cm)",
        "Unknown",
        "5'4 (163 cm)",
        "Unknown",
        "Unknown",
        "Unknown",
        "Unknown",
        "6'2 (188 cm)",
        "5'9 (175 cm)"
    )

    private val legendHome = arrayOf(
        "Typhon",
        "Gridiron",
        "Solace",
        "Psamathe",
        "Solace",
        "Psamathe",
        "Salvo",
        "Solace",
        "Gaea",
        "Solace",
        "Gaea",
        "Psamathe",
        "Unknown",
        "Talos",
        "Unknown",
        "Gaea"
    )

    private val legendBiography = arrayOf(
        "Wraith is a whirlwind fighter, able to execute deadly attacks and manipulate spacetime by opening rifts in the fabric of reality — but those abilities came at a price. Years ago, she woke up in an IMC detention facility with no memory of who she was. Senior Science Pilot Renee Blasey, who volunteered as guinea pig for her own experiments whose partner betrayed her and locked her away no longer existed.",
        "Born into a military family where she, her parents, and her four older brothers all served with the IMC, Bangalore has been an exceptional soldier her whole life. Dedicated to the IMC cause, she was top of her class at the IMC Military Academy and the only cadet who could take apart a Peacekeeper, equip it with a Precision Choke hop-up, and put it back together in under twenty seconds – blindfolded.",
        "Mirage is the kind of guy who likes to stand out. The youngest of four brothers, he perfected the art of fooling around to get attention. The one thing he took seriously was Holo-Pilot technology: introduced to the illusion-creating tech by his engineer mother, he poured over the mechanisms and learned all he could about them. Even when his brothers went MIA during the Frontier War, Mirage and his mother continued to develop holo devices, and the work brought them closer.",
        "One day, Octavio Silva was bored. In fact, he was bored most days. Son of the preoccupied CEO of Silva Pharmaceuticals and wanting for nothing in life, he entertained himself by performing death-defying stunts and posting holovids of them for his fans to gawk over. So, this day, he decided to set the course record for a nearby Gauntlet by launching himself across the finish line – using a grenade.",
        "Revenant used to be human. He used to be the greatest hitman the Mercenary Syndicate ever had. He used to look in the mirror and see his human face looking back. Then one day, he finally saw what he had become at the hands of the Mercenary Syndicate and Hammond Robotics: a walking nightmare of steel and vestigial flesh.",
        "Almost a century ago, the Outlands were dangling on the edge of a cataclysmic energy crisis. Dr. Mary Somers, a charmingly eccentric astrophysicist, was hired to find a solution. Mary moved her family to the scientific research station on Olympus and set to work. With the help of her apprentice, Dr. Reid, Mary discovered Branthium - an element she was convinced could be the key to limitless energy. But Branthium can be found only on the accretion disk of a black hole, so Mary and Dr. Reid departed on a dangerous mission to prove her theory right.",
        "Ladies’ man, man’s man, and all-round manly man, Fuse is a one-man wrecking crew... and he knows it. Fuse exudes joy; he’s a laid-back explosives enthusiast who’s damn near covered in things that go BOOM. Fuse doesn’t lack confidence, but he often lacks a plan. He’s a blow-up-first ask-questions-later kinda guy, who’s always looking for a good scrap.",
        "Gibraltar is a gentle giant with a wild side. The son of two S.A.R.A.S. (Search and Rescue Association of Solace) volunteers, he has always been skilled at getting others out of dangerous situations that are common in the Outlands. However, he only began to understand the value of protecting others when he and his boyfriend Nikolas stole his father's motorcycle, took it on a joyride, and got trapped by a deadly mudslide. His parents saved them, and his father lost an arm in the process. Gibraltar has never forgotten that sacrifice and has devoted his life to helping those in need.",
        "Alexander Maxwell Nox was born to Arthur Rutherford Nox and Katerina Ticacek Nox on February 25, 2685. He worked as a research scientist for Humbert Labs on his homeworld Gaea, the Frontier's leading manufacturer of pesticide gases. With a glut of pesticides needed to protect the growing Frontier colonies’ crops, Humbert Labs was constantly on the hunt for better and stronger formulas. Nox was one of their brightest scientists and worked day and night developing new gases. But to make sure they worked, he needed to test them on more than just inert tissue: he needed something living.",
        "Natalie Paquette is a familiar face in the Apex Games, though for a different reason than most. Daughter of the Games’ lead electrical engineer Luc Paquette, she studied his manuals to stay close to him and discovered her calling at a young age. Though she could be completely distracted one moment and hyper-focused the next, electricity grounded her – its ordered, predictable flow made sense in a way the rest of the world didn’t.",
        "Rampart is a blue-collar, private business owner who just needs a big gun and a backpack full of scrap metal to get by in the dangerous, wild west world of the Outlands. Before opening her popular modding shop on Gaea, Ramya Parekh made a name for herself in the underground gauntlet circuit. Parekh climbed to the top showcasing pure skill using her custom-modded gear. She began taking jobs from smugglers, Syndicate members, and everyone in between. Some say it ain't great unless it's got \"Rampart\" written on it.",
        "Ajay Che isn't someone you would expect to find in the Apex Games. Once the child of wealthy war profiteers, she left home when she learned of the damage her family had caused and enlisted in the Frontier Corps, a humanitarian organization that aids Frontier communities in need. She's since devoted her life to helping others and joined the Apex Games to fund the Frontier Corps with her winnings.",
        "When Loba was nine, she looked on as simulacrum hitman Revenant killed her parents. Left with nothing, Loba was given to a foster family. But like her mother and father, she quickly found out she was good at being a thief. She started with picking pockets and as her skills improved, Loba used every tool at her disposal to lift herself from the gutter. Everything changed when she broke into a supposedly impenetrable facility and got her hands on the Jump Drive tech stored inside. With her new teleportation bracelet, the most secure and unattainable items were within her reach. So was her dream of living the high life.",
        "Bloodhound is known across the Outlands as one of the greatest game hunters the Frontier has ever seen. The child of two engineers stationed at the New Dawn industrial plant on Talos, Bloodhound was taken in by their uncle Artur after a meltdown destroyed the facility and killed both their parents. Artur taught them the \"Old Ways\", a belief system that focuses on the glory of nature and rejects modern technology. Yet Bloodhound was constantly drawn to technological marvels, and ultimately used both new and old methods to take down a Goliath that preyed on the people of their village, forever changing their life’s path.",
        "Pathfinder is the picture of optimism, despite his circumstances. A MRVN (Mobile Robotic Versatile eNtity) modified to specialize in location scouting and surveying, he booted up thirty-three years ago in an abandoned laboratory with no idea who created him or why. With only his MRVN designation to hint at his identity, Pathfinder set off in search of his creator by stowing on merchant ships and traveling everywhere between Solace to Gaea for a couple of years. After one of his legs broke due to someone attempting to steal said leg, he took odd jobs to gain information about his maker and to get the money to fix his leg.",
        "A brilliant hacker and encryption expert, he uses aerial drones to spy on his opponents in the Apex Arena without being seen. Orphans raised on the streets of Suotamo, Tae Joon and his foster sister Mila Alexander escaped a life of squalor by becoming computer engineers, designing drones used by the Syndicate to transmit the Apex Games throughout the Outlands. But two years ago, Tae Joon and Mila stumbled upon an algorithm that could predict the result of any Apex Games match, hidden away in the Games’ own computer systems. That caught the attention of the wrong people - the next day, Mila disappeared, and Tae Joon was forced into hiding after he was framed for her murder. With his reputation destroyed, and the Syndicate after him, he gave up his identity, his face, and his family in order to facilitate his redemption."
    )

    private val legendSkillT = arrayOf(
        "Into the Void",
        "Smoke Launcher",
        "Psyche Out",
        "Stim",
        "Silence",
        "Gravity Lift",
        "Knuckle Cluster",
        "Dome of Protection",
        "Nox Gas Trap",
        "Perimeter Security",
        "Amped Cover",
        "D.O.C. Heal Drone",
        "Burglar's Best Friend",
        "Eye of the Allfather",
        "Grappling Hook",
        "Surveillance Drone"
    )

    private val legendSkillP = arrayOf(
        "Voices from the Void",
        "Double Time",
        "Now You See Me...",
        "Swift Mend",
        "Stalker",
        "Spacewalk",
        "Grenadier",
        "Gun Shield",
        "Nox Vision",
        "Spark of Genius",
        "Modded Loader",
        "Combat Revive",
        "Eye for Quality",
        "Tracker",
        "Insider Knowledge",
        "Neurolink"
    )

    private val legendSkillU = arrayOf(
        "Dimensional Rift",
        "Rolling Thunder",
        "Life of the Party",
        "Launch Pad",
        "Death Totem",
        "Black Hole",
        "The Motherlode",
        "Defensive Bombardment",
        "Nox Gas Grenade",
        "Interception Pylon",
        "Emplaced Minigun \"Sheila\"",
        "Care Package",
        "Black Market Boutique",
        "Beast of the Hunt",
        "Zipline Gun",
        "Drone EMP"
    )

    private val legendSkillImageT = arrayOf(
        R.drawable.wraith_skillq,
        R.drawable.bangalore_skillt,
        R.drawable.mirage_skillt,
        R.drawable.octane_skillt,
        R.drawable.revenant_skillt,
        R.drawable.horizon_skillt,
        R.drawable.fuse_skillt,
        R.drawable.gibraltar_skillt,
        R.drawable.caustic_skillt,
        R.drawable.wattson_skillt,
        R.drawable.rampart_skillt,
        R.drawable.lifeline_skillt,
        R.drawable.loba_skillt,
        R.drawable.bloodhound_skillt,
        R.drawable.pathfinder_skillt,
        R.drawable.crypto_skillt
    )

    private val legendSkillImageP = arrayOf(
        R.drawable.wraith_skillp,
        R.drawable.bangalore_skillp,
        R.drawable.mirage_skillp,
        R.drawable.octane_skillp,
        R.drawable.revenant_skillp,
        R.drawable.horizon_skillp,
        R.drawable.fuse_skillp,
        R.drawable.gibraltar_skillp,
        R.drawable.caustic_skillp,
        R.drawable.wattson_skillp,
        R.drawable.rampart_skillp,
        R.drawable.lifeline_skillp,
        R.drawable.loba_skillp,
        R.drawable.bloodhound_skillp,
        R.drawable.pathfinder_skillp,
        R.drawable.crypto_skillp
    )

    private val legendSkillImageU = arrayOf(
        R.drawable.wraith_skillu,
        R.drawable.bangalore_skillu,
        R.drawable.mirage_skillu,
        R.drawable.octane_skillu,
        R.drawable.revenant_skillu,
        R.drawable.horizon_skillu,
        R.drawable.fuse_skillu,
        R.drawable.gibraltar_skillu,
        R.drawable.caustic_skillu,
        R.drawable.wattson_skillu,
        R.drawable.rampart_skillu,
        R.drawable.lifeline_skillu,
        R.drawable.loba_skillu,
        R.drawable.bloodhound_skillu,
        R.drawable.pathfinder_skillu,
        R.drawable.crypto_skillu
    )

    val listData: ArrayList<Legend>
        get() {
            val list = arrayListOf<Legend>()
            for (position in legendNames.indices) {
                val legend = Legend()
                legend.name = legendNames[position]
                legend.title = legendTitles[position]
                legend.image = legendImages[position]
                legend.roleImage = legendRoleImages[position]
                legend.imageDetail = legendDetailImages[position]
                legend.realName = legendRealName[position]
                legend.gender = legendGender[position]
                legend.age = legendAge[position]
                legend.height = legendHeight[position]
                legend.home = legendHome[position]
                legend.biography = legendBiography[position]
                legend.skillTName = legendSkillT[position]
                legend.skillPName = legendSkillP[position]
                legend.skillUName = legendSkillU[position]
                legend.skillTImage = legendSkillImageT[position]
                legend.skillPImage = legendSkillImageP[position]
                legend.skillUImage = legendSkillImageU[position]
                list.add(legend)
            }
            return list
        }

}