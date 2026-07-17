package com.example.CampaignManager.modelDTO.spell;

import com.example.CampaignManager.modelDTO.ApiReferenceDTO;
import com.example.CampaignManager.modelDTO.DcDTO;
import com.example.CampaignManager.modelDTO.ObjectIdDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpellDTO {

    @JsonProperty("_id")
    private ObjectIdDTO id;

    private String index;
    private String name;

    @JsonProperty("desc")
    private List<String> description;

    @JsonProperty("higher_level")
    private List<String> higherLevel;

    private String range;

    private List<String> components;

    private String material;

    private boolean ritual;

    private String duration;

    private boolean concentration;

    @JsonProperty("casting_time")
    private String castingTime;

    private int level;

    private DamageDTO damage;

    private DcDTO dc;

    @JsonProperty("attack_type")
    private String attackType;

    @JsonProperty("area_of_effect")
    private AreaOfEffectDTO areaOfEffect;

    private ApiReferenceDTO school;

    private List<ApiReferenceDTO> classes;

    private List<ApiReferenceDTO> subclasses;

    @JsonProperty("heal_at_slot_level")
    private Map<String, String> healAtSlotLevel;

    private String url;

    @JsonProperty("updated_at")
    private String updatedAt;


    //Getters
    public ObjectIdDTO getId() {return id;}

    public String getName() {return name;}

    public String getIndex() {return index;}

    public int getLevel() {return level;}

    public DamageDTO getDamage() {return damage;}

    public List<String> getComponents() {return components;}

    public DcDTO getDc() {return dc;}

    public Boolean getRitual(){return ritual;}

    public Boolean getConcentration() {return concentration;}

    public List<String> getDescription() {return description;}

    public List<String> getHigherLevel() {return higherLevel;}

    public String getCastingTime() {return castingTime;}

    public String getDuration() {return duration;}

    public String getAttackType() {return attackType;}

    public String getMaterial() {return material;}

    public String getRange() {return range;}

    public String getUrl() {return url;}

    public String getUpdatedAt() {return updatedAt;}

    public AreaOfEffectDTO getAreaOfEffect() {return areaOfEffect;}

    public List<ApiReferenceDTO> getClasses() {return classes;}

    public List<ApiReferenceDTO> getSubclasses() {return subclasses;}

    public Map<String, String> getHealAtSlotLevel() {return healAtSlotLevel;}

    public ApiReferenceDTO getSchool() {return school;}

    //Setters

    public void setName(String name) {this.name = name;}

    public void setDescription(List<String> description) {this.description = description;}

    public void setLevel(int level) {this.level = level;}

    public void setIndex(String index) {this.index = index;}

    public void setDc(DcDTO dc) {this.dc = dc;}

    public void setId(ObjectIdDTO id) {this.id = id;}

    public void setDamage(DamageDTO damage) {this.damage = damage;}

    public void setAttackType(String attackType) {this.attackType = attackType;}

    public void setCastingTime(String castingTime) {this.castingTime = castingTime;}

    public void setAreaOfEffect(AreaOfEffectDTO areaOfEffect) {this.areaOfEffect = areaOfEffect;}

    public void setComponents(List<String> components) {this.components = components;}

    public void setConcentration(boolean concentration) {this.concentration = concentration;}

    public void setDuration(String duration) {this.duration = duration;}

    public void setHigherLevel(List<String> higherLevel) {this.higherLevel = higherLevel;}

    public void setMaterial(String material) {this.material = material;}

    public void setSchool(ApiReferenceDTO school) {this.school = school;}

    public void setRange(String range) {this.range = range;}

    public void setUrl(String url) {this.url = url;}

    public void setRitual(boolean ritual) {this.ritual = ritual;}

    public void setUpdatedAt(String updatedAt) {this.updatedAt = updatedAt;}

    public void setClasses(List<ApiReferenceDTO> classes) {this.classes = classes;}

    public void setHealAtSlotLevel(Map<String, String> healAtSlotLevel) {this.healAtSlotLevel = healAtSlotLevel;}

    public void setSubclasses(List<ApiReferenceDTO> subclasses) {this.subclasses = subclasses;}

    public void setRitual(Boolean ritual){this.ritual = ritual;}

    public void setConcentration(Boolean concentration) {this.concentration = concentration;}
}