package com.app.valorantassistant;

public class Database {
    public Database() {

    }

    public AgentData getAgent(String agent) {
        switch (agent) {
            case "Breach":
                return Breach;
            case "Brimstone":
                return Brimstone;
            case "Cypher":
                return Cypher;
            case "Jett":
                return Jett;
            case "Omen":
                return Omen;
            case "Phoenix":
                return Phoenix;
            case "Raze":
                return Raze;
            case "Sage":
                return Sage;
            case "Sova":
                return Sova;
            case "Viper":
                return Viper;
            default:
                return null;
        }
    }

    public WeaponData getWeapon(String weapon) {
        switch (weapon) {
            case "tactical knife":
                return Knife;
            case "classic":
                return Classic;
            case "shorty":
                return Shorty;
            case "frenzy":
                return Frenzy;
            case "ghost":
                return Ghost;
            case "sheriff":
                return Sheriff;
            case "stinger":
                return Stinger;
            case "spectre":
                return Spectre;
            case "bulldog":
                return Bulldog;
            case "guardian":
                return Guardian;
            case "phantom":
                return Phantom;
            case "vandal":
                return Vandal;
            case "bucky":
                return Bucky;
            case "judge":
                return Judge;
            case "ares":
                return Ares;
            case "odin":
                return Odin;
            case "marshal":
                return Marshal;
            case "operator":
                return Operator;
            default:
                return null;

        }
    }

    AgentData Breach = new AgentData("Breach", "Initiator", "Breach uses seismic attacks to deal damage and disorient his enemies through the ground.", new String[]{"Aftershock", "Flashpoint", "Fault Line", "Rolling Thunder"}, new String[]{"Equip a fusion charge. Fire the charge to set a slow-acting burst through the wall. The burst does heavy damage to anyone caught in its area.", "Equip a blinding charge. Fire the charge to set a fast-acting burst through the wall. The charge detonates to blind all players looking at it.", "Equip a seismic blast. Hold Fire to increase the distance. Release to set off the quake, dazing all players in its zone and in a line up to the zone.", "Equip a seismic charge. Fire to send a cascading quake through all terrain in a large cone. The quake dazes and knocks up anyone caught in it."}, new String[]{"100", "200", "Free", "7 Ultimate Points"});
    AgentData Brimstone = new AgentData("Brimstone", "Controller", "Brimstone is a versatile leader due to his ability to drop sky smokes, incendiary enemies, give rapid-fire to his allies, and summon a massive lethal laser from the sky.", new String[]{"Incendiary", "Stim Beacon", "Sky Smoke", "Orbital Strike"}, new String[]{"Equip an Incendiary grenade launcher. Fire to launch a grenade that detonates as it comes to a rest on the floor, creating a lingering fire zone that damages players within the zone.", "Equip a Stim Beacon. Fire to toss the stim beacon in front of Brimstone. Upon landing, the stim beacon will create a field that grants players RapidFire.", "Equip a tactical map. Fire to set locations where Brimstone's smoke clouds will land. Alternate Fire to confirm, launching long-lasting smoke clouds that block vision in the selected area.", "Equip a tactical map. Fire to launch a lingering orbital strike laser at the selected location dealing high damage over-time to players caught in the selected area."}, new String[]{"200", "100", "100", "6 Ultimate Points"});
    AgentData Cypher = new AgentData("Cypher", "Sentinel", "Cypher is the king of intel with his ability to capture enemies with tripwires, spot enemies with his surveillance camera, and reveal the enemy team's location.", new String[]{"Tripwire", "Cyber Cage", "Spycam", "Neural Theft"}, new String[]{"Equip a trapwire. Fire to place a destructible and covert tripware at the targeted location, creating a line that spans between the placed location and the wall opposite. Enemy players who cross a tripwire will be tethered, revealed, and dazed after a short period if they do not destroy the device in time. This ability can be picked up to be redeployed.", "Equip a cyber cage. Fire to toss the cyber cage in front of Cypher. Activate to create a zone that blocks vision and slows enemies who pass through it.", "Equip a spycam. Fire to place the spycam at the targeted location. REUSE this ability to take control of the camera's view. While in control of the camera. Fire to shoot a marking dart. This dart will reveal the location of any player struck by the dart.", "Instantly use on a dead enemy player in your crosshairs to reveal the location of all living enemy players."}, new String[]{"200", "100", "Free", "7 Ultimate Points"});
    AgentData Jett = new AgentData("Jett", "Duelist", "Jett is a mobile agent who can dash and jump quickly with lethal expertise in knives.", new String[]{"Cloudburst", "Updraft", "Tailwind", "Blade Storm"}, new String[]{"Instantly throw a projectile that expands into a brief vision cloud on impact with a surface. Hold the ability key to curve the cloud in the direction of your crosshair.", "Instantly propel Jett high into the air.", "Instantly propel in the direction she is moving. If Jett is standing still, she will propel forward.", "Equip a set of highly accurate throwing knives that recharge on an opponent. Fire to throw a single knife at your target. Alternative Fire to throw all remaining daggers at your target."}, new String[]{"100", "200", "Free", "6 Ultimate Points"});
    AgentData Omen = new AgentData("Omen", "Controller", "Omen lurks from the shadows with the ability to teleport and distort his enemies' visons.", new String[]{"Shrouded Step", "Paranoia", "Dark Cover", "From the Shadows"}, new String[]{"Equip a shadow walk ability and see its range indicator. Fire to begin a brief channel, then teleport to the marked location.", "Instantly fire a shadow projectile forward, briefly reducing the vision range of all players it touches. This projectile can pass straight through walls.", "Equip a shadow orb and see its range indicator. Fire to throw the shadow orb to the marked location, creating a long-lasting shadow sphere that blocks vision. Hold Alternate Fire while targeting to move the marker further away. Hold the ability key with targeting to move the marker closer.", "Equip a tactical map. Fire to begin teleporting to the selected location. While teleporting, Omen will appear as a Shade that can be destroyed by an enemy to cancel his teleport."}, new String[]{"100", "200", "Free", "7 Ultimate Points"});
    AgentData Phoenix = new AgentData("Phoenix", "Duelist", "Phoenix has an aggressive fighting style as he lights up the battlefield with his fire and flashbangs", new String[]{"Blaze", "Curveball", "Hot Hands", "Run it Back"}, new String[]{"Equip a flame wall. Fire to create a line of flames that moves forward creating a wall that blocks vision and damages players passing through it. Hold Fire to bend the wall in the direction of your crosshair.", "Equip a flare orb that takes a curving path and detonates shortly after throwing, impairing vision. Fire to curve the flare orb to the left, detonating and blinding any player who sees the orb. Alternate fire to curve the flare orb to the right.", "Equip a fireball. Fire to throw a fireball that explodes after a set amount of time or upon hitting the ground, creating a lingering fire zone that damages enemies.", "Instantly place a marker at Phoenix's location. While this ability is active, dying or allowing the timer to expire will end this ability and bring Phoenix back to this location with full health."}, new String[]{"200", "100", "Free", "6 Ultimate Points"});
    AgentData Raze = new AgentData("Raze", "Duelist", "Raze can clear tight-spaces and explode enemies with multiple forms of deadly explosives.", new String[]{"Boom Bot", "Blast Pack", "Paint Shells", "Showstopper"}, new String[]{"Equip a Boom Bot. Fire will deploy the bot, causing it to travel in a straight line on the ground, bouncing off walls. The Boom Bot will lock on to any enemies in its frontal cone and chase them, exploding for heavy damage if it reaches them.", "Instantly throw a Blast Pack that will stick to surfaces. Re-use the ability after deployment to detonate, damaging, and moving anything hit.", "Equip a cluster grenade. Fire to throw the grenade, which does damage and creates sub-munitions, each doing damage to anyone in their range.", "Raze equips a single-use rocket launcher with the ability to one-shot enemies. Damage from this ability is consistent throughout the entire blast radius."}, new String[]{"200", "100", "Free", "6 Ultimate Points"});
    AgentData Sage = new AgentData("Sage", "Sentinel", "Sage is essential to any team with her ability to heal and revive teammates as well as prevent enemy pushes with her barrier and slow orbs.", new String[]{"Barrier Orb", "Slow Orb", "Healing Orb", "Resurrection"}, new String[]{"Equip a barrier orb. Fire places a solid wall. Alternate fire rotates the targeter.", "Equip an orb that slows whoever walks on them after being thrown on the ground.", "Equip a healing orb. Fire with your crosshairs over a damaged ally to activate a heal-over-time on them. Alternate fire while Sage is damaged to activate a self heal-over-time.", "Equip a resurrection ability. Fire with your crosshairs placed over a dead ally to begin resurrecting them. After a brief channel, the ally will be brought back to life with full health."}, new String[]{"300", "100", "Free", "7 Ultimate Points"});
    AgentData Sova = new AgentData("Sova", "Initiator", "Sova is a master with the bow as he can send out shock bolts, recon bolts, and a lethal fury of energy blasts.", new String[]{"Shock Bolt", "Owl Drone", "Recon Bolt", "Hunter's Fury"}, new String[]{"Equip a bow with shock bolt. Fire to send the explosive bolt forward detonating upon collision and damaging players nearby. Hold Fire to extend the range of the projectile. Alternate Fire to add up to two bounces to this arrow.", "Equip an owl drone. Fire to deploy and take control of movement of the drone. While in control of the drone, Fire to shoot a marking dart. This dart will reveal the location of any player struck by the dart.", "Equip a bow with recon bolt. Fire to send the bolt forward activating upon collision and revealing the location of nearby enemies caught in the line of sight of the bolt. Enemies can destroy this bolt. Hold Fire to extend the range of the projectile. Alternate Fire to add up to two bounces to this arrow.", "Equip a bow with three long-range, wall-piercing energy blasts. Fire to release a blast in a line in front of Sova dealing damage and revealing the location of enemies caught in the line. This ability can be RE-USED up to two more times while the ability timer is active."}, new String[]{"100", "300", "Free", "7 Ultimate Points"});
    AgentData Viper = new AgentData("Viper", "Controller", "Viper controls the battlefield by disrupting vision, dealing damage, and blocking off areas with her poisonous gas.", new String[]{"Snake Bite", "Poison Cloud", "Toxic Screen", "Viper's Pit"}, new String[]{"Equip a chemical launcher. Fire to launch a canister that shatters upon hitting the floor, creating a lingering chemical zone that damages and slows enemies.", "Equip a gas emitter. Fire to throw the emitter that perpetually remains throughout the round. Re-use the ability to create a toxic gas cloud at the cost of fuel. This ability can be re-used more than once and can be picked up to be redeployed.", "Equip a gas emitter launcher. Fire to deploy a long line of gas emitters. Re-use the ability to create a tall wall of toxic gas at the cost of fuel. This ability can be re-used more than once.", "Equip a chemical sprayer. Fire to spray a chemical cloud in all directions around Viper, creating a large cloud that reduces the vision range and maximum health of players inside of it."}, new String[]{"100", "200", "Free", "7 Ultimate Points"});


    WeaponData Classic = new WeaponData("Classic", "Sidearm", "Free", "12", "Low", "Semi-Automatic", "6.75 rounds/sec", "3-round burst", "2.22 rounds/sec", "0 - 30m", "26", "78", "22", "30 - 50m", "22", "66", "18", "", "", "", "");
    WeaponData Shorty = new WeaponData("Shorty", "Sidearm", "200", "2", "Low", "Semi-Automatic", "3.3 rounds/sec", "", "", "0 - 9m", "12", "36", "10", "9 - 15m", "8", "24", "6", "", "", "", "");
    WeaponData Frenzy = new WeaponData("Frenzy", "Sidearm", "400", "13", "Low", "Full-automatic", "10 rounds/sec", "", "", "0 - 20m", "26", "78", "22", "20 - 50m", "21", "63", "17", "", "", "", "");
    WeaponData Ghost = new WeaponData("Ghost", "Sidearm", "500", "15", "Medium", "Semi-automatic", "6.75 rounds/sec", "", "", "0 - 30m", "30", "105", "26", "30 - 50m", "25", "88", "21", "", "", "", "");
    WeaponData Sheriff = new WeaponData("Sheriff", "Sidearm", "800", "6", "High", "Semi-Automatic", "4 rounds/sec", "", "", "0-30m", "55", "160", "47", "30 - 50m", "50", "145", "43", "", "", "", "");
    WeaponData Stinger = new WeaponData("Stinger", "SMG", "1,000", "20", "Low", "Full-automatic", "18 rounds/sec", "1.15x 4 round burst , spread reduction", "4 rounds/sec", "0 - 20m", "27", "67", "23", "20 - 50m", "25", "62", "21", "", "", "", "");
    WeaponData Spectre = new WeaponData("Spectre", "SMG", "1,600", "30", "Medium", "Full-automatic", "13.33 rounds/sec", "1.15x , spread reduction", "12 rounds/sec", "0 - 20m", "26", "78", "22", "20 - 50m", "22", "66", "18", "", "", "", "");
    WeaponData Bulldog = new WeaponData("Bulldog", "Rifle", "2,100", "24", "Medium", "Full-Automatic", "9.15 rounds/sec", "1.25x 3-Round burst", "4 rounds/sec", "0 - 50m", "35", "116", "30", "", "", "", "", "", "", "", "");
    WeaponData Guardian = new WeaponData("Guardian", "Rifle", "2,700", "12", "Medium", "Semi-automatic", "6.5 rounds/sec", "1.5x slight , spread reduction", "6.5 rounds/sec", "0 - 50m", "65", "195", "49", "", "", "", "", "", "", "", "");
    WeaponData Phantom = new WeaponData("Phantom", "Rifle", "2,900", "30", "Medium", "Full-automatic", "11 rounds/sec", "1.25x slight , spread reduction", "9.9 rounds/sec", "0 - 15m", "39", "156", "33", "15 - 30m", "35", "140", "30", "30 - 50m", "31", "124", "26");
    WeaponData Vandal = new WeaponData("Vandal", "Rifle", "2,900", "25", "Medium", "Full-automatic", "9.25 rounds/sec", "1.25x slight , spread reduction", "8.32 rounds/sec", "0 - 50m", "39", "156", "33", "", "", "", "", "", "", "", "");
    WeaponData Bucky = new WeaponData("Bucky", "Shotgun", "900", "5", "Low", "Semi-automatic", "1.1 rounds/sec", "Semi-automatic Air Burst (extended primary fire shot)", "1.1 rounds/sec", "0 - 8m", "22", "44", "19", "8 - 12m", "17", "34", "14", "12 - 50m", "9", "18", "8");
    WeaponData Judge = new WeaponData("Judge", "Shotgun", "1,500", "7", "Medium", "Full-automatic", "3.5 rounds/sec", "", "", "0 - 10m", "17", "34", "14", "10 - 15m", "13", "26", "11", "15 - 50m", "10", "20", "9");
    WeaponData Ares = new WeaponData("Ares", "Heavy", "1,700", "50", "High", "Full-automatic", "10 to 13 rounds/sec (increasing during fire)", "1.25x slight , spread reduction", "10 to 13 rounds/sec (increasing during fire)", "0 - 30m", "30", "72", "25", "30 - 50m", "28", "67", "23", "", "", "", "");
    WeaponData Odin = new WeaponData("Odin", "Heavy", "3,200", "100", "High", "Full-automatic", "12 to 15.6 rounds/sec (increasing during fire)", "1.25x slight , spread reduction", "15.6 rounds/sec", "0 - 30m", "38", "95", "32", "30 - 50m", "31", "77", "26", "", "", "", "");
    WeaponData Marshal = new WeaponData("Marshal", "Sniper", "1,100", "5", "Medium", "Semi-automatic", "1.5 rounds/sec", "2.5x slight , spread reduction", "1.2 rounds/sec", "0 - 50m", "101", "202", "85", "", "", "", "", "", "", "", "");
    WeaponData Operator = new WeaponData("Operator", "Sniper", "4,500", "5", "High", "Semi-automatic", "0.75 rounds/sec", "Dual-Zoom Mode (2.5x or 5x) significant spread reduction", "0.75 rounds/sec", "0 - 50m", "150", "255", "127", "", "", "", "", "", "", "", "");
    WeaponData Knife = new WeaponData("Tactical Knife", "Melee", "FREE", "0 - 8m", "50", "75");


}
