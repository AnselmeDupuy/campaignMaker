package com.example.CampaignManager.modelDTO.monster;

import com.example.CampaignManager.modelDTO.ApiReferenceDTO;
import com.example.CampaignManager.modelDTO.ObjectIdDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MonsterDTO {

    @JsonProperty("_id")
    private ObjectIdDTO id;

    private String index;
    private String name;
    private String desc;

    private String size;
    private String type;
    private String subtype;
    private String alignment;

    @JsonProperty("armor_class")
    private List<ArmorClassDTO> armorClass;

    @JsonProperty("hit_points")
    private int hitPoints;

    @JsonProperty("hit_dice")
    private String hitDice;

    @JsonProperty("hit_points_roll")
    private String hitPointsRoll;

    private SpeedDTO speed;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private List<ProficiencyEntryDTO> proficiencies;

    @JsonProperty("damage_vulnerabilities")
    private List<String> damageVulnerabilities;

    @JsonProperty("damage_resistances")
    private List<String> damageResistances;

    @JsonProperty("damage_immunities")
    private List<String> damageImmunities;

    @JsonProperty("condition_immunities")
    private List<ApiReferenceDTO> conditionImmunities;

    private SenseDTO senses;

    private String languages;

    @JsonProperty("challenge_rating")
    private double challengeRating;

    @JsonProperty("proficiency_bonus")
    private int proficiencyBonus;

    private int xp;

    @JsonProperty("special_abilities")
    private List<SpecialAbilityDTO> specialAbilities;

    private List<ActionDTO> actions;

    @JsonProperty("legendary_actions")
    private List<ActionDTO> legendaryActions;

    private String image;
    private String url;

    @JsonProperty("updated_at")
    private String updatedAt;

    public MonsterDTO() {}

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getIndex() {
        return index;
    }

    public String getSize() {
        return size;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public List<ArmorClassDTO> getArmorClass() {
        return armorClass;
    }

    public List<ProficiencyEntryDTO> getProficiencies() {
        return proficiencies;
    }

    public ObjectIdDTO getId() {
        return id;
    }

    public List<String> getDamageImmunities() {
        return damageImmunities;
    }

    public List<ApiReferenceDTO> getConditionImmunities() {
        return conditionImmunities;
    }

    public List<String> getDamageResistances() {
        return damageResistances;
    }

    public List<String> getDamageVulnerabilities() {
        return damageVulnerabilities;
    }

    public SpeedDTO getSpeed() {
        return speed;
    }

    public String getHitDice() {
        return hitDice;
    }

    public String getHitPointsRoll() {
        return hitPointsRoll;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getUrl() {
        return url;
    }

    public double getChallengeRating() {
        return challengeRating;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public int getXp() {
        return xp;
    }

    public List<ActionDTO> getActions() {
        return actions;
    }

    public List<ActionDTO> getLegendaryActions() {
        return legendaryActions;
    }

    public List<SpecialAbilityDTO> getSpecialAbilities() {
        return specialAbilities;
    }

    public SenseDTO getSenses() {
        return senses;
    }

    public String getImage() {
        return image;
    }

    public String getLanguages() {
        return languages;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setProficiencies(List<ProficiencyEntryDTO> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public void setArmorClass(List<ArmorClassDTO> armorClass) {
        this.armorClass = armorClass;
    }

    public void setSpeed(SpeedDTO speed) {
        this.speed = speed;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDamageResistances(List<String> damageResistances) {
        this.damageResistances = damageResistances;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public void setDamageVulnerabilities(List<String> damageVulnerabilities) {
        this.damageVulnerabilities = damageVulnerabilities;
    }

    public void setHitPointsRoll(String hitPointsRoll) {
        this.hitPointsRoll = hitPointsRoll;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDamageImmunities(List<String> damageImmunities) {
        this.damageImmunities = damageImmunities;
    }

    public void setId(ObjectIdDTO id) {
        this.id = id;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setActions(List<ActionDTO> actions) {
        this.actions = actions;
    }

    public void setSpecialAbilities(List<SpecialAbilityDTO> specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public void setConditionImmunities(List<ApiReferenceDTO> conditionImmunities) {
        this.conditionImmunities = conditionImmunities;
    }

    public void setChallengeRating(double challengeRating) {
        this.challengeRating = challengeRating;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setLegendaryActions(List<ActionDTO> legendaryActions) {
        this.legendaryActions = legendaryActions;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public void setSenses(SenseDTO senses) {
        this.senses = senses;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}