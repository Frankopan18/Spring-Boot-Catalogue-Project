package com.task.entity.article;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {
	@Id
	private long idOfArticle;
	private Date dateOfEntry;
	private String fullAuthorName;
	private String linkToArticle;
	private String headline;
	private int idOfAuthor;
	private int totalVotes;

	public long getId() {
		return idOfArticle;
	}

	public void setId(long id) {
		this.idOfArticle = id;
	}

	public Date getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(Date dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public String getFullAuthorName() {
		return fullAuthorName;
	}

	public void setFullAuthorName(String fullAuthorName) {
		this.fullAuthorName = fullAuthorName;
	}

	public String getLink() {
		return linkToArticle;
	}

	public void setLink(String link) {
		this.linkToArticle = link;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public int getIdOfAuthor() {
		return idOfAuthor;
	}

	public void setIdOfAuthor(int idOfAuthor) {
		this.idOfAuthor = idOfAuthor;
	}

	public int getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfEntry == null) ? 0 : dateOfEntry.hashCode());
		result = prime * result + ((fullAuthorName == null) ? 0 : fullAuthorName.hashCode());
		result = prime * result + ((headline == null) ? 0 : headline.hashCode());
		result = prime * result + (int) (idOfArticle ^ (idOfArticle >>> 32));
		result = prime * result + idOfAuthor;
		result = prime * result + ((linkToArticle == null) ? 0 : linkToArticle.hashCode());
		result = prime * result + totalVotes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (dateOfEntry == null) {
			if (other.dateOfEntry != null)
				return false;
		} else if (!dateOfEntry.equals(other.dateOfEntry))
			return false;
		if (fullAuthorName == null) {
			if (other.fullAuthorName != null)
				return false;
		} else if (!fullAuthorName.equals(other.fullAuthorName))
			return false;
		if (headline == null) {
			if (other.headline != null)
				return false;
		} else if (!headline.equals(other.headline))
			return false;
		if (idOfArticle != other.idOfArticle)
			return false;
		if (idOfAuthor != other.idOfAuthor)
			return false;
		if (linkToArticle == null) {
			if (other.linkToArticle != null)
				return false;
		} else if (!linkToArticle.equals(other.linkToArticle))
			return false;
		if (totalVotes != other.totalVotes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Article [idOfArticle=" + idOfArticle + ", dateOfEntry=" + dateOfEntry + ", fullAuthorName="
				+ fullAuthorName + ", link=" + linkToArticle + ", headline=" + headline + ", idOfAuthor=" + idOfAuthor
				+ ", totalVotes=" + totalVotes + "]";
	}

}
